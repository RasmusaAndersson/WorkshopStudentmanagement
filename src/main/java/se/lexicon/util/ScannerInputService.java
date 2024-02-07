package se.lexicon.util;

import org.springframework.stereotype.Component;
import se.lexicon.util.UserInputService;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {
    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        return Integer.parseInt(getString());
    }

    private Scanner scanner;
}
