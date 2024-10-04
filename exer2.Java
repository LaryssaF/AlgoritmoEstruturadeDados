/**
 * @param vetor
 * @param inicio
 * @param fim
 * @param valor
 * @return
 */
public static int buscaBinaria(int[] vetor, int inicio, int fim, int valor){
    if (inicio>fim){ //vetor não tem os elementos
        return -1;
    }
    int meio=(inicio + fim)/2;
    if (vetor[meio]== valor){
        return meio;
    }else if (valor>vetor[meio]){
        return buscaBinaria(vetor, meio+1, fim, valor);
    }else {
        return buscaBinaria(vetor, inicio, meio-1, valor);
    }
}

//T(n)= 1* T(n/2)
//O(n)= O(log2n)