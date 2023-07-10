use hr;

#Questão - 1
	#item A)
select d.department_name,avg(e.salary) as "Media_salarial"
  from employees e
 inner join departments d
  on d.department_id = e.department_id
group by d.department_id
order by avg(e.salary);
 
#item B)
   select ep.employee_id, 
		  ep.first_name, 
		  ep.last_name, 
          ep.salary,(select avg(e.salary)
					   from employees e
                      inner join departments d
                         on d.department_id = e.department_id
					  where d.department_id = ep.department_id
                      group by d.department_id) as media, 
			dp.department_name,
            (ep.salary - (select avg(e.salary)
					   from employees e
                      inner join departments d
                         on d.department_id = e.department_id
					  where d.department_id = ep.department_id
                      group by d.department_id)) as diferenca
   from employees ep
   inner join departments dp
      on dp.department_id = ep.department_id
    order by dp.department_name;
    
 #Questão - 1
	#item C)   

SELECT d.department_name, 
       COUNT(CASE WHEN e.salary < avg_salaries.avg_salary THEN 1 ELSE NULL END) AS salarios_abaixo_da_media,
       COUNT(*) AS quantidade_de_funcionarios
FROM departments d
JOIN (
    SELECT department_id, AVG(salary) AS avg_salary
    FROM employees
    GROUP BY department_id
) AS avg_salaries ON d.department_id = avg_salaries.department_id
JOIN employees e ON d.department_id = e.department_id
GROUP BY d.department_name;

#Questão 2
   #Para que o modelo mencionado esteja de acordo com a LGPD, algumas ações podem ser tomadas, como: 
   #criptografar as informações sensíveis presentes na tabela paciente, como os campos DNA e Etinia, para garantir a confidencialidade e integridade dos dados. 
   #implementar controles de acesso aos dados sensíveis, limitando o acesso a profissionais autorizados e com justificativa adequada para acessá-los.
   #e adotar políticas de retenção de dados.
   
#Questão3
use hospital3;

  explain select * from medico where especialidade like 'pediatra';
  #para otimizar a consulta acima podemos criar um indice na coluna especialidade da tabela medico
  #sendo assim, o indice é criado através do seguinte comando:
  CREATE INDEX idx_especialidade ON medico (especialidade);
  
#Questão4
 #Item A)
 
 CREATE TRIGGER tr_comentario AFTER INSERT ON comentario
FOR EACH ROW
BEGIN
  DECLARE projeto_id INT;
  DECLARE usuario_id INT;
  SELECT id_projeto, id_usuario INTO projeto_id, usuario_id FROM comentario WHERE id = NEW.id;
  INSERT INTO likes_por_projeto (id_projeto, id_usuario) VALUES (projeto_id, usuario_id);
END;

 #Item B)
 
 CREATE TRIGGER likes_por_projeto_trigger AFTER INSERT ON likes_por_projeto
FOR EACH ROW
BEGIN
  DECLARE likes_count INT;
  SELECT COUNT(*) INTO likes_count FROM likes_por_projeto WHERE id_projeto = NEW.id_projeto;
  IF likes_count = 1000 THEN
    INSERT INTO notificacao (mensagem) VALUES ('O projeto ' || (SELECT titulo FROM projeto WHERE id = NEW.id_projeto) || ' atingiu 1000 likes!');
  END IF;
END;


#Questão 5

#Criando tabelas 
CREATE TABLE membros
(id INT AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
email VARCHAR(255),
dataNascimento DATE, 
PRIMARY KEY (id));

CREATE TABLE lembrete
(id INT AUTO_INCREMENT,
membroId INT,
mensagem VARCHAR(255) NOT NULL,
PRIMARY KEY (id , membroId));

##Triger
DELIMITER $$
CREATE TRIGGER trigger_aniversario_proximo
AFTER INSERT ON membros
FOR EACH ROW
BEGIN
    IF DATE_ADD(NEW.dataNascimento, INTERVAL 7 DAY) = DATE_ADD(CURDATE(), INTERVAL 7 DAY) THEN
        INSERT INTO lembrete (membroId, mensagem) VALUES (NEW.id, CONCAT('Olá membros, o aniversário do membro_', NEW.nome, ' é daqui a 7 dias. Vamos comprar uma lembrança para ele?'));
    END IF;
END $$
DELIMITER ;


#Questão - 6
#Criando a tabela

Create table produto
(idProduto int not null auto_increment,
nome varchar(45) null,
preco_normal decimal(10,2) null,
preco_desconto decimal(10,2) null,
primary key (idProduto));


#Trigger
CREATE TRIGGER atualiza_preco_desconto 
BEFORE INSERT ON produto 
FOR EACH ROW 
SET NEW.preco_desconto = NEW.preco_normal * 0.92;


#Questão - 7
select d.department_name, min(salary) as "min_salary", max(salary) as "max_salary", avg(salary) as "average_salary"
  from employees e
 inner join departments d on d.department_id = e.department_id
 group by e.department_id
 order by d.department_name



