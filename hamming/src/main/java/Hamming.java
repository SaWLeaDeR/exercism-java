import java.util.stream.IntStream;

class Hamming {

    private final int distance;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand's lenght and rightStrand's lenght must be equal.");
        }

        distance = Math.toIntExact(IntStream.range(0, rightStrand.length())
                .filter(s -> rightStrand.charAt(s) != leftStrand.charAt(s)).count());
    }

    int getHammingDistance() {
        return distance;
    }

}
