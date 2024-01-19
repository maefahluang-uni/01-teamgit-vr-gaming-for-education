package util;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--; // faulty decrement
	}

	// method resets _ctr
	public void reset() {
		_ctr = 0; // faulty reset, _ctr should rather be 0
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
		_ctr = -99;
	}

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		_ctr = -99;
	}

	private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method increments _ctr to the closest prime number
public void incrementToPrime() {
    increment();

    while (!isPrime(_ctr)) {
        _ctr++;
    }
}

// method decrements _ctr to the closest prime number
public void decrementToPrime() {
	decrement();

    while (!isPrime(_ctr)) {
        _ctr--;
    }
}

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	 public void countFrequency(String word, String sentence) {
        if (word == null || sentence == null) {
            throw new IllegalArgumentException("Word and sentence must not be null.");
        }

        // Using regex to find all occurrences of the word in the sentence
        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        _ctr = count;
    }

    public int getFrequency() {
        return _ctr;
    }

}
