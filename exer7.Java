//fila circular 
public class Fila{
    private int[] vetor = meio int[10];
    private int inicio = 0;
    private int fim = 0;
    private int nItens=0;
}
//inserir 
public void inserir(int valor){
    if (nItens < vetor.length){
        nItens++;
    vetor[fim++]=valor;
    if (fim == vetor.length){
        fim = 0;
    }else {
        throw new RuntimeException("overflow");
    }
    }
}
//remover 
public int remover(){
    if (nItens>0){
        int valor = vetor[inicio++];
        nItens--;
        if (inicio == vetor.length){
            inicio=0;
        }
        return valor;
    }else{
        throw new RuntimeException('underflow');
    }
}