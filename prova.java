//Levei aproximadamente 3h para escrever as funções no caderno e passar para o computador, corrigindo ao longo do processo//
// Eu daria uma nota 7/8, tive alguns erros mas consegui corrigir sem dificuldades//
public class prova{

    public static void main(String[]args){
        int[] a = {5, 4, 3, 2, 1}; 
        int[] b = {8, 5, 7, 2, 1}; 
        int[] u = new int[10]; 
        int tamA = 5; 
        int tamB = 5; 
        int tamU = uniao(a, tamA, b, tamB, u); 
        System.out.println("Vetor U:"); 
        for (int i = 0; i < tamU; i += 1) { 
            System.out.print(u[i] + " "); } 
            System.out.println(); 
            System.out.println("Tamanho de U: " + tamU); 
        }

    
public static boolean busca(int[]u, int n, int x){
    for(int i=0; i<n; i+=1){
        if(u[i] == x){
            return true;
        }
    }
    return false;
}
public static int uniao(int []a, int tamA, int[]b, int tamB, int[]u){
    int tamU = 0;
    for (int i = 0; i<tamA; i+=1){
        if(!busca(u, tamU, a[i])){
            u[tamU] = a[i];
            tamU +=1;
        }

    }

    for (int j =0; j<tamB; j+=1){
        if(!busca(u, tamU, b[j])){
            u[tamU] = b[j];
            tamU +=1;

        }

    }
    return tamU;
}

public static void ordenar(int [] v, int n){
    for(int i = 1; i<n; i+=1 ){
        int aux = v[i];
        int j = i -1;
        while(j >= 0 && v[j]> aux){
            v[j+1] = v[j];
            j-=1;
        }
        v[j+1] = aux;
    }

}

public static int gerarVetorSemRepeticao(int [] v, int tamV, int[] Vsr){
    int tamVsr = 0 ;
    for(int i =0; i<tamV; i+=1){
        if (!busca(Vsr, tamVsr, v[i])){
            Vsr[tamVsr] = v[i];
            tamVsr += 1;
        }

    }
    return tamVsr;
}
public static void rotacionar(int[]v, int tam, int k){
    if (k > 0) {
        for (int i = 0; i < k; i += 1) {

            int aux = v[0];

            for (int j = 0; j < tam - 1; j += 1) {
                v[j] = v[j + 1];
            }

            v[tam - 1] = aux;
        }
           } else if (k < 0) {
    for (int i = 0; i < -k; i += 1) {

            int aux = v[tam - 1];

            for (int j = tam - 1; j > 0; j -= 1) {
                v[j] = v[j - 1];
            }

            v[0] = aux;
  

         }
      }
    }
}
