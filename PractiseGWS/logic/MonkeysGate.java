
class MonkeysGate {
    public static void main(String[] args) {
        int numberOfGates = 100;
        boolean[] gates = new boolean[numberOfGates + 1];

        for (int i = 1; i <= numberOfGates; i++) {
            for (int j = i; j <= numberOfGates; j += i) {    // j=2+2  2=2+2  
                gates[j] = !gates[j]; 
            }
        }

        int gateCount = 0;
        System.out.println("Gates open:");
        for (int i = 1; i <= numberOfGates; i++) {
            if (gates[i]) {
                gateCount++;
                System.out.println("Gate " + i);
            }
        }

        System.out.println("Total gates open: " + gateCount);
    }
}
