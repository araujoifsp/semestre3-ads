typedef struct NO *arovereLLRB;

Arv *cria_arv();

int cor(struct NO *H);

void trocaCor(struct NO *H);

void NO *rotacionaEsquerda(struct NO *A);

void NO *rotacionaDireita(struct NO *A);

struct NO *move2EsqRED(struct NO *H);

struct NO *move2DirRED(struct NO *H);

struct NO *balancear(struct NO *H);

int insere_arvoreLLRB(arovereLLRB *raiz, int valor);

struct NO *insereNO(struct NO *H, int valor, int *resp);

int remove_arvoreLLRB(arovereLLRB *raiz, int valor);

struct NO *removeNO(struct NO *H, int valor);

struct NO *removeMenor(struct NO *H);

struct NO *procuraMenor(struct NO *atual);
