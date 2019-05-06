package io.mekmanager.example;

public enum Attribute {
    STR {
        @Override
        public String toString() {
            return "Strength";
        }
    },
    BOD {
        @Override
        public String toString() {
            return "Body";
        }
    },
    RFL {
        @Override
        public String toString() {
            return "Reflexes";
        }
    },
    DEX {
        @Override
        public String toString() {
            return "Dexterity";
        }
    },
    INT {
        @Override
        public String toString() {
            return "Intelligence";
        }
    },
    WIL {
        @Override
        public String toString() {
            return "Willpower";
        }
    },
    CHA {
        @Override
        public String toString() {
            return "Charisma";
        }
    },
    EDG {
        @Override
        public String toString() {
            return "Edge";
        }
    }
}
