package org.example;

import java.time.LocalDate;
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

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", dataDeNascimento=" + dataDeNascimento +
                    '}';
        }

        // Fazer a classe Pessoa ser ordenada pelos nomes das pessoas
        @Override
        public int compareTo(org.example.Pessoa pessoa) {

            return this.nome.compareTo(pessoa.getNome());

        }
    }

