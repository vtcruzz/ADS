import javax.swing.JOptionPane;

class Playlist {
    private String[] musicas;
    private int tamanho;

    public Playlist(int capacidade) {
        musicas = new String[capacidade];
        tamanho = 0;
    }

    public void adicionarMusica(String musica) {
        if (tamanho < musicas.length) {
            musicas[tamanho] = musica;
            tamanho++;
            JOptionPane.showMessageDialog(null, "Tá lá, música adicionada com sucesso.");
        } else {
        	JOptionPane.showMessageDialog(null, "Não da mais não, a playlist ta cheia meu querido(a).");
        }
    }

    public void listarMusicas(String name, String user) {
		JOptionPane.showMessageDialog(null, "Playlist: " + name + "\n" + "Autor: " + user);
        for (int i = 0; i < tamanho; i++) {
            JOptionPane.showMessageDialog(null, (i + 1) + ". " + musicas[i]);
         
        }
    }
}


