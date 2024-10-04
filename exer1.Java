/**
 * @param vetor
 * @param vetor
 * @return
 */
private static int buscaLinear(int[] vetor, int valor){ 
    for (int i=0; i < vetor.length; i++){  //n
        if (vetor[i]==valor){  //n
            return i; //1
        }
    }
        return -1; //0
    }


// pior caso  T(n) = (n+1)+n+1= 2n + 2 
// O(n)