package controller;

public class numericController {
    
    public numericController() {
        super();
    }

    public long conversorMayan(String[] vet) throws Exception {
        if(vet.length > 8) {
            throw new Exception("Quantidade de símbolos passa do limite permitido.");
        }

        long numInt = 0;
        int tamanho = vet.length - 1;

        for (int i = 0; i <= tamanho; i++) {
            char[] caracteres = vet[i].toCharArray();
            
            for (char j : caracteres) {
                if (j == '-') {
                    numInt += 5 * Math.pow(20, tamanho - i);
                } else if (j == '.') {
                    numInt += 1 * Math.pow(20, tamanho - i);
                } else if (j == '*') {
                    numInt += 0;
                } else {
                    throw new Exception("Valores inválidos encontrados.");
                }
            }
        }
        
        return numInt;
    }
}