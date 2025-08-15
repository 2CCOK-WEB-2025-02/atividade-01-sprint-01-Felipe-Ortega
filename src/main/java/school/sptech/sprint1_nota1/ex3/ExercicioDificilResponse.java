package school.sptech.sprint1_nota1.ex3;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDificilResponse {
    private int enesimoTermo;
    private int soma;

    public ExercicioDificilResponse() {
    }

    public ExercicioDificilResponse(int enesimoTermo, int soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public List<Integer> calcularLista(int numero){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(0);
        if (numero <= 0){
            return lista;
        }
        numero = Integer.parseInt(String.valueOf(numero));
        lista.add(1);
        for (int i = 1; lista.size() <= numero; i++) {
            lista.add(lista.get(i-1)+lista.get(i));
        }
        return lista;
    }

    public int EnesimoTermo(List<Integer> list, Integer numero) {
        if (numero < 0){
            numero = 0;
        }
        this.enesimoTermo = list.get(numero);
        return getEnesimoTermo();
    }

    public int calcularSoma(List<Integer> list){
        for(Integer i: list){
            soma+=i;
        }
        return soma;
    }

    public int getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(int enesimoTermo) {
        this.enesimoTermo = enesimoTermo;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
}
