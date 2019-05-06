package io.mekmanager.example;

public enum Learning {
    FAST {
        @Override
        public String toString() {
            return "Fast";
        }
    },
    STANDARD {
        @Override
        public String toString() {
            return "Standard";
        }
    },
    SLOW {
        @Override
        public String toString() {
            return "Slow";
        }
    }
}