package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa implements Comparable<Pessoa> {

        private String nome;

        private LocalDate dataDeNascimento;

        public Pessoa(String nome, LocalDate dataDeNascimento) {
            this.nome = nome;
            this.dataDeNascimento = dataDeNascimento;
        }


        public String getNome() {
            return nome;
        }

        public int getIdade () {

            return Period.between(dataDeNascimento, LocalDate.now()).getYears();

        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", dataDeNascimento=" + dataDeNascimento +
                    '}';
        }

        // Fazer a classe Pessoa ser ordenada pelos nomes das pessoas
        @Override
        public int compareTo(Pessoa pessoa) {

             Integer idade =  getIdade();
             int retorno =  idade.compareTo(pessoa.getIdade());

                if (retorno == 0) {
                    return this.nome.compareTo(pessoa.getNome());
                }

                return retorno;
        }
    }

