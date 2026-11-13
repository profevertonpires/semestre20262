package threads;

public class Corrida implements Runnable {
    private String nome;
    public Corrida(String nome) { this.nome = nome; }

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(nome + " rodando volta " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }


}
