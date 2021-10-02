package com.gdstruc.midterms;

import java.util.Objects;

public class Card

    {
        private int id;
        private String name;


        public Card(int id, String name) {
            this.id = id;
            this.name = name;

        }

        @Override
        public String toString() {
            return "Card {" +
                    "id = " + id +
                    ", name = " + name +
                    '}';
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            com.gdstruc.midterms.Card card = (com.gdstruc.midterms.Card) o;
            return id == card.id && name.equals(card.name);
        }
    }

