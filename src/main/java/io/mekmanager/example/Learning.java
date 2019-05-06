package io.mekmanager.example;

public enum Learning {
    FAST {
        public String toString() {
            return "Fast";
        }
    },
    STANDARD {
        public String toString() {
            return "Standard";
        }
    },
    SLOW {
        public String toString() {
            return "Slow";
        }
    }
}