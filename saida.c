#include <stdio.h>
#include <stdlib.h>

#include <string.h>


int main() {
    typedef struct {
        char nome[80];
        int idade;
    } treg;

    treg reg;
    strcpy(reg.nome, "Maria");
    reg.idade = 30;
    printf("%s", reg.nome);
    printf(" tem ");
    printf("%d", reg.idade);
    printf(" anos");
   return 0;
}
