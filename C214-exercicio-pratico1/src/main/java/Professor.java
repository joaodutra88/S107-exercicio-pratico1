import org.json.JSONObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import net.minidev.json.JSONStyle;
import net.minidev.json.JSONValue;
//import com.jayway.jsonpath.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Objects;


public class Professor {
    private String nome;
    private String horarioAtendimento;
    private String periodo;
    private int sala;
    private int predio;

    // construtor
    public Professor(String nome, String horarioAtendimento, String periodo, int sala, int predio) {
        this.nome = Objects.requireNonNull(nome);
        this.horarioAtendimento = Objects.requireNonNull(horarioAtendimento);
        this.periodo = Objects.requireNonNull(periodo);
        if (sala < 0) {
            throw new IllegalArgumentException("Sala do professor não pode ser menor que zero.");
        }
        this.sala = sala;
        if (predio < 0) {
            throw new IllegalArgumentException("Prédio do professor não pode ser menor que zero.");
        }
        if (predio > 6) {
            throw new IllegalArgumentException("Prédio do professor não pode ser maior que 6.");
        }
        this.predio = predio;
    }
    // getters e setters
    public String getNome() {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorarioAtendimento() {
        if (horarioAtendimento == null || horarioAtendimento.trim().isEmpty()) {
            throw new IllegalArgumentException("Horário do professor não pode ser nulo ou vazio.");
        }
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public String getPeriodo() {
        if (periodo == null || periodo.trim().isEmpty()) {
            throw new IllegalArgumentException("Período do professor não pode ser nulo ou vazio.");
        }
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getSala() {
        if (sala < 0) {
            throw new IllegalArgumentException("Sala do professor não pode ser menor que zero.");
        }
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getPredio() {
        return predio;
    }

    public void setPredio(int predio) {
        this.predio = predio;
    }

    public static Professor fromJson(String json) {
        if (json == null || json.isEmpty()) {
            throw new IllegalArgumentException("JSON string cannot be empty");
        }
        JSONObject jsonObj = new JSONObject(json);
        String nome = jsonObj.getString("nome");
        String horarioAtendimento = jsonObj.getString("horarioAtendimento");
        String periodo = jsonObj.getString("periodo");
        int sala = jsonObj.getInt("sala");
        int predio = jsonObj.getInt("predio");

        return new Professor(nome, horarioAtendimento, periodo, sala, predio);
    }
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"nome\":\"").append(nome).append("\",");
        sb.append("\"horarioAtendimento\":\"").append(horarioAtendimento).append("\",");
        sb.append("\"periodo\":\"").append(periodo).append("\",");
        sb.append("\"sala\":").append(sala).append(",");
        sb.append("\"predio\":").append(predio);
        sb.append("}");
        return sb.toString();
    }

}
