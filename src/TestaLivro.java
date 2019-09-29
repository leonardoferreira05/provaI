
//QUESTAO 3


public class TestaLivro {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 1;
        d1.mes = 2;
        d1.ano = 2019;
        
        Livro l1 = new Livro();
        l1.nome = "Introduçaõ";
        l1.preço = 1.7;
        l1.dataDeLancamento = d1;
        
        d1.imprimir();
               
    }
    
}
