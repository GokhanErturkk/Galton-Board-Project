package estu.ceng.edu;

import org.junit.Test;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import static org.junit.Assert.*;

public class Main2Test {

    @Test
    public void testMain() throws CmdLineException, InterruptedException {
        // Create a Main instance
        Main main = new Main();

        // Simulate command-line arguments
        String[] args = {"-numThread", "10000", "-numBins", "30"};

        // Pass the arguments to the Main class using CmdLineParser
        CmdLineParser parser = new CmdLineParser(main);
        parser.parseArgument(args);

        // Run the method
        main.startGaltonBoard();

    }
}
