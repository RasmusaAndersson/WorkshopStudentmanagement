package se.lexicon.data_access;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{
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
