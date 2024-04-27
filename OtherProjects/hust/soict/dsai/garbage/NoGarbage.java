import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String filename = "test.txt";

        long startTime, endTime;
        
        Path path = Paths.get(filename);
        byte[] inputBytes = Files.readAllBytes(path);

        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b: inputBytes) {
            outputStringBuilder.append((char) b);
        }

        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}