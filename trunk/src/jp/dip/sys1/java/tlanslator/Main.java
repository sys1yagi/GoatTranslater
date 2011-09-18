package jp.dip.sys1.java.tlanslator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import jp.dip.sys1.java.tlanslator.util.Util;

public class Main {
	public static class Options {
		String mode;
		String file;
	}

	public static void main(String[] args) {
		new Main().run(args);
	}

	private Options mOptions;

	public void run(String[] args) {
		try {
			parseArgs(args);
			if ("-h".equals(mOptions.mode)) {
				printHelp();
				return;
			}
		} catch (GoatTranslatorException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void parseArgs(String[] args) throws GoatTranslatorException {
		if (args.length <= 0) {
			throw new GoatTranslatorException("-h option. show help.");
		}
		mOptions = new Options();
		mOptions.mode = args[0];
		if (args.length >= 2) {
			mOptions.file = args[1];
		}
	}

	public void printHelp() {
		// TODO print help
		// -f filename
	}

	public List<Token> translate(String file) throws IOException {
		return translate(new FileInputStream(file));
	}

	public List<Token> translate(InputStream in){
		try{
			
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			Util.close(in);
		}
		
		return null;
	}
}
