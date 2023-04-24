import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.LinkedList;

public class SocialNetwork {
    private Queue<Persona> espera;
    private PriorityQueue<Persona> prioridad;
    private Stack<Persona> eliminados;

    public SocialNetwork() {
        this.espera = new LinkedList<Persona>();
        this.prioridad = new PriorityQueue<Persona>();
        this.eliminados = new Stack<Persona>();
    }

    public void agregarParticipante(Persona participante) {
        espera.add(participante);
        prioridad.add(participante);
    }

    public Persona obtenerSiguienteParticipante() {
        return espera.poll();
    }

    public Persona obtenerSiguienteParticipantePrioridad() {
        return prioridad.poll();
    }

    public void eliminarParticipante() {
        Persona eliminado = prioridad.poll();
        eliminados.push(eliminado);
    }

    public Persona obtenerParticipanteEliminado() {
        return eliminados.pop();
    }
}

