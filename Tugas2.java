import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Tugas2 {
	final static boolean[][] k = { hexToBool("428a2f98d728ae22"),
			hexToBool("7137449123ef65cd"), hexToBool("b5c0fbcfec4d3b2f"),
			hexToBool("e9b5dba58189dbbc"), hexToBool("3956c25bf348b538"),
			hexToBool("59f111f1b605d019"), hexToBool("923f82a4af194f9b"),
			hexToBool("ab1c5ed5da6d8118"), hexToBool("d807aa98a3030242"),
			hexToBool("12835b0145706fbe"), hexToBool("243185be4ee4b28c"),
			hexToBool("550c7dc3d5ffb4e2"), hexToBool("72be5d74f27b896f"),
			hexToBool("80deb1fe3b1696b1"), hexToBool("9bdc06a725c71235"),
			hexToBool("c19bf174cf692694"), hexToBool("e49b69c19ef14ad2"),
			hexToBool("efbe4786384f25e3"), hexToBool("0fc19dc68b8cd5b5"),
			hexToBool("240ca1cc77ac9c65"), hexToBool("2de92c6f592b0275"),
			hexToBool("4a7484aa6ea6e483"), hexToBool("5cb0a9dcbd41fbd4"),
			hexToBool("76f988da831153b5"), hexToBool("983e5152ee66dfab"),
			hexToBool("a831c66d2db43210"), hexToBool("b00327c898fb213f"),
			hexToBool("bf597fc7beef0ee4"), hexToBool("c6e00bf33da88fc2"),
			hexToBool("d5a79147930aa725"), hexToBool("06ca6351e003826f"),
			hexToBool("142929670a0e6e70"), hexToBool("27b70a8546d22ffc"),
			hexToBool("2e1b21385c26c926"), hexToBool("4d2c6dfc5ac42aed"),
			hexToBool("53380d139d95b3df"), hexToBool("650a73548baf63de"),
			hexToBool("766a0abb3c77b2a8"), hexToBool("81c2c92e47edaee6"),
			hexToBool("92722c851482353b"), hexToBool("a2bfe8a14cf10364"),
			hexToBool("a81a664bbc423001"), hexToBool("c24b8b70d0f89791"),
			hexToBool("c76c51a30654be30"), hexToBool("d192e819d6ef5218"),
			hexToBool("d69906245565a910"), hexToBool("f40e35855771202a"),
			hexToBool("106aa07032bbd1b8"), hexToBool("19a4c116b8d2d0c8"),
			hexToBool("1e376c085141ab53"), hexToBool("2748774cdf8eeb99"),
			hexToBool("34b0bcb5e19b48a8"), hexToBool("391c0cb3c5c95a63"),
			hexToBool("4ed8aa4ae3418acb"), hexToBool("5b9cca4f7763e373"),
			hexToBool("682e6ff3d6b2b8a3"), hexToBool("748f82ee5defb2fc"),
			hexToBool("78a5636f43172f60"), hexToBool("84c87814a1f0ab72"),
			hexToBool("8cc702081a6439ec"), hexToBool("90befffa23631e28"),
			hexToBool("a4506cebde82bde9"), hexToBool("bef9a3f7b2c67915"),
			hexToBool("c67178f2e372532b"), hexToBool("ca273eceea26619c"),
			hexToBool("d186b8c721c0c207"), hexToBool("eada7dd6cde0eb1e"),
			hexToBool("f57d4f7fee6ed178"), hexToBool("06f067aa72176fba"),
			hexToBool("0a637dc5a2c898a6"), hexToBool("113f9804bef90dae"),
			hexToBool("1b710b35131c471b"), hexToBool("28db77f523047d84"),
			hexToBool("32caab7b40c72493"), hexToBool("3c9ebe0a15c9bebc"),
			hexToBool("431d67c49c100d4c"), hexToBool("4cc5d4becb3e42b6"),
			hexToBool("597f299cfc657e2a"), hexToBool("5fcb6fab3ad6faec"),
			hexToBool("6c44198c4a475817") };
	static boolean[][] initialReg = { hexToBool("6a09e667f3bcc908"),
		hexToBool("bb67ae8584caa73b"), hexToBool("3c6ef372fe94f82b"),
		hexToBool("a54ff53a5f1d36f1"), hexToBool("510e527fade682d1"),
		hexToBool("9b05688c2b3e6c1f"), hexToBool("1f83d9abfb41bd6b"),
		hexToBool("5be0cd19137e2179")};
	public static void main(String[] args) throws IOException {
		File file = new File("tes.txt");
		byte[] data = new byte[(int) file.length()];
		FileInputStream in = new FileInputStream(file);
		in.read(data);
		in.close();	
		enkripsi(data);
//		boolean[] p = hexToBool("6a09e667f3bcc908");
//		
//		for(int i=0; i<p.length; i++){
//			System.out.print(p[i]==true? "1": "0");
//		} System.out.println();
//		String hasil = toString(new boolean[]{true, false, false, false});
//		int j = Integer.parseInt(hasil, 2);
//		String n = Integer.toString(j, 16);
//		String hasil2 = toString(new boolean[]{true, false, false, false});
//		int j2 = Integer.parseInt(hasil2, 2);
//		String n2 = Integer.toString(j2, 16);
//		//fileOutput.print(n);
//		System.out.print(n);
//		System.out.print(n2);
//		System.out.println();
//		String hasil3 = toString2(new boolean[]{true, false, false, false, true, false, false, false});
//		int j3 = Integer.parseInt(hasil3, 2);
//		String n3 = Integer.toString(j3, 16);
//		//fileOutput.print(n);
//		System.out.print(n3);
//		System.out.println();
//		byte temp1 = (byte) Integer.parseInt("01100001",2);
//		byte temp2 = (byte) Integer.parseInt("01100010",2);
//		byte temp3 = (byte) Integer.parseInt("01100011",2);
//		boolean[] h = byteToABool(new byte[] {temp1, temp2, temp3});
//		for(int i=0; i<h.length; i++){
//			System.out.print(h[i]==true? "1": "0");
//		} System.out.println();
//		enkripsi(new byte[] {temp1, temp2, temp3});
	}

	public static void enkripsi(byte[] dataBool) throws IOException {
		boolean[] afterPadding = padding(dataBool);
		for(int i=0; i<afterPadding.length; i++){
			System.out.print(afterPadding[i]==true? "1": "0");
		} System.out.println();
		int panjangM = afterPadding.length/1024;
		//System.out.println(panjangM);
		for(int i=0; i<panjangM; i++){
			boolean[] m1024 = new boolean[1024];
			System.arraycopy(afterPadding, i*1024, m1024, 0, m1024.length);
			round1024(m1024);
		}
		
		File out = new File("output.txt");
		PrintWriter fileOutput = new PrintWriter(out);
		for(int w=0; w<8; w++){
			for(int u=0; u<16; u++){
				boolean[] temp = new boolean[4];
				for(int s=0; s<4; s++){
					temp[s]=initialReg[w][(u*4)+s];
					//System.out.print(initialReg[w][(u*4)+s]==true? "1": "0");
				} //System.out.println();
				String hasil = toString(temp);
				int j = Integer.parseInt(hasil, 2);
				String n = Integer.toString(j, 16);
				fileOutput.print(n);
				//System.out.print(n);
			}
		} fileOutput.close();
		// for(int i=0; i<afterPadding.length; i++){
		// String z = afterPadding[i]==true? "1" : "0";
		// System.out.print(z);
		// } System.out.println();
		// System.out.println(afterPadding.length);
		// int panjangData=(data.length%8);

		// proses(withPadding, 0, key, fileOutput, 0);
		//
		// fileOutput.write((byte) jumlahPadding);
		// fileOutput.close();
	}
	
	public static void round (boolean[][] initial, boolean[] w, boolean[] k){
		//boolean[][] hasil = new boolean[8][8];
		boolean[] t1 = addBinary(addBinary(addBinary(initial[7], Ch(initial[4], initial[5], initial[6])), addBinary(e512(initial[4]), w)), k);
		boolean[] t2 = addBinary(a512(initial[0]), Maj(initial[0], initial[1], initial[2]));
		initial[7] = initial[6];
		initial[6] = initial[5];
		initial[5] = initial[4];
		initial[4] = addBinary(initial[3], t1);
		initial[3] = initial[2];
		initial[2] = initial[1];
		initial[1] = initial[0];
		initial[0] = addBinary(t2, t1);
	}
	
	//asumsikan udah buat 1024
	public static void round1024 (boolean[] m){
		System.out.println("masuk");
		boolean[][] w = potongM (m);
		boolean[][] initial = new boolean[8][64];
		for(int i=0; i<8; i++){
			System.arraycopy(initialReg[i], 0, initial[i], 0, initial[i].length);
		}
		
		boolean[] hasil512 = new boolean[512];
		for(int i=0; i<16; i++){
			round(initial, w[i], k[i]);
			System.out.println(i);
			for(int j=0; j<64; j++){
				System.out.print(initial[0][j]==true? "1":"0");
				//System.out.print(w[i][j]==true? "1":"0");
			} System.out.println();
			System.out.println("---------------------------");
		}
		for(int i=16; i<80; i++){
			w[i] = addBinary(addBinary(i512(w[i-2]), w[i-7]), addBinary(o512(w[i-15]), w[i-16]));
			System.out.println(i);
			for(int j=0; j<64; j++){
				//System.out.print(initial[0][j]==true? "1":"0");
				System.out.print(w[i][j]==true? "1":"0");
			} System.out.println();
			System.out.println("---------------------------");
			round(initial, w[i], k[i]);
		}
		for(int i=0; i<8; i++){
			initialReg[i] = addBinary(initial[i], initialReg[i]);
		}
	}
	
	public static boolean[][] potongM (boolean[] m){
		boolean[][] w = new boolean[80][64];
		for(int i=0; i<16; i++){
			System.arraycopy(m, i*64, w[i], 0, w[i].length);//asumsikan gue d
		} return w;
	}

	public static boolean[] padding(byte[] dataBool) {
		boolean[] data = byteToABool(dataBool);
		int sisa = 1024 - (data.length % 1024);
		int ceil = (int) Math.ceil(data.length / 1024.0);
		String jml = Integer.toString(data.length, 2);
		int end = 128 - jml.length();
		for (int i = 0; i < end; i++) {
			jml = "0" + jml;
			// System.out.println(jml + " "+ i);
		}
		// System.out.println(jml.length());
		if (sisa < 128 || sisa == 1024) {
			boolean[] withPadding = new boolean[(ceil * 1024) + 1024];
			System.arraycopy(data, 0, withPadding, 0, data.length);
			withPadding[data.length] = true;
			int mlength = withPadding.length - 128;
			for (int i = data.length + 1; i < mlength; i++) {
				withPadding[i] = false;
			}
			for (int i = 0; i < 128; i++) {
				withPadding[mlength + i] = jml.charAt(i) == '1' ? true : false;
			}
			return withPadding;
		} else if (sisa == 128) {
			boolean[] withPadding = new boolean[(ceil * 1024)];
			System.arraycopy(data, 0, withPadding, 0, data.length);
			int mlength = withPadding.length - 128;
			for (int i = 0; i < 128; i++) {
				withPadding[mlength + i] = jml.charAt(i) == '1' ? true : false;
			}
			return withPadding;
		} else {
			boolean[] withPadding = new boolean[(ceil * 1024)];
			System.arraycopy(data, 0, withPadding, 0, data.length);
			// System.out.println(data.length);
			withPadding[data.length] = true;
			int mlength = withPadding.length - 128;
			for (int i = data.length + 1; i < mlength; i++) {
				withPadding[i] = false;
			}
			for (int i = 0; i < 128; i++) {
				withPadding[mlength + i] = jml.charAt(i) == '1' ? true : false;
			}
			return withPadding;
		}
	}

	public static boolean[] hexToBool(String hex) {
		//hex="6";
		boolean[] hasil = new boolean[hex.length() * 4];
		for (int k = 0; k < 16; k++) {
			int j = Integer.parseInt(hex.charAt(k) + "", 16);
			String bin = Integer.toBinaryString(j);
			if(bin.length() == 1)
				bin = "000" + bin;
			else if(bin.length() == 2)
				bin = "00" + bin;
			else if(bin.length() == 3)
				bin = "0" + bin;
			for (int i = 0; i < bin.length(); i++) {
				hasil[(k * 4) + i] = (bin.charAt(i) == '1') ? true : false;
			}
		}

		return hasil;
	}

	public static boolean[] byteToABool(byte[] a) {
		boolean[] b = new boolean[a.length * 8];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 8; j++) {
				b[(i * 8) + (7 - j)] = (a[i] & (1 << j)) == 0 ? false : true;
			}
		}
		return b;
	}

	public static boolean[] byteToABoolc(byte[] a) {
		boolean[] b = new boolean[64];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				b[(i * 8) + (7 - j)] = (a[i] & (1 << j)) == 0 ? false : true;
			}
		}
		return b;
	}

	public static boolean[] addBinary(boolean[] a, boolean[] b) {
		boolean[] hasil = new boolean[a.length];
		int carry = 0;
		for (int i = 0; i < a.length; i++) {
			int m = (a[a.length - i - 1]) == false ? 0 : 1;
			int n = (b[b.length - i - 1]) == false ? 0 : 1;
			int add = m + n + carry;

			hasil[a.length - i - 1] = (add % 2) == 0 ? false : true;
			carry = add / 2;
		}
		return hasil;
	}

	public static boolean[] Ch(boolean[] e, boolean[] f, boolean[] g){
		boolean[] result = new boolean[64];
		for(int i=0; i < 64; i++){
			result[i] = e[i]? f[i]: g[i];
		}
		return result;
	}
	
	public static boolean[] Maj(boolean[] a, boolean[] b, boolean[] c){
		boolean[] result = new boolean[64];
		boolean[] aAndb = new boolean[64];
		boolean[] aAndc = new boolean[64];
		boolean[] bAndc = new boolean[64];
		for(int i=0; i<64; i++){
			aAndb[i] = a[i] && b[i];
			aAndc[i] = a[i] && c[i];
			bAndc[i] = b[i] && c[i];
			result[i] = aAndb[i] ^ aAndc[i] ^ bAndc[i]; 
		}
		
		return result;
	}
	
	public static boolean[] rotateRight(boolean[] register, int n){
		boolean[] result = new boolean[register.length];
		System.arraycopy(register, register.length-n, result, 0, n);
		System.arraycopy(register, 0, result, n, register.length-n);
		return result;
	}
	
	public static boolean[] a512(boolean[] a){
		boolean[] result = new boolean[64];
		boolean[] duaLapan = new boolean[64];
		boolean[] tigaEmpat = new boolean[64];
		boolean[] tigaSembilan = new boolean[64];
		duaLapan = rotateRight(a, 28);
		tigaEmpat = rotateRight(a, 34);
		tigaSembilan = rotateRight(a, 39);
		for(int i=0; i<64; i++){
			result[i] = duaLapan[i] ^ tigaEmpat[i] ^ tigaSembilan[i]; 
		}
		return result;
	}
	
	public static boolean[] e512(boolean[] e){
		boolean[] result = new boolean[64];
		boolean[] empatBelas = new boolean[64];
		boolean[] lapanBelas = new boolean[64];
		boolean[] empatSatu = new boolean[64];
		empatBelas = rotateRight(e, 14);
		lapanBelas = rotateRight(e, 18);
		empatSatu = rotateRight(e, 41);
		for(int i=0; i<64; i++){
			result[i] = empatBelas[i] ^ lapanBelas[i] ^ empatSatu[i]; 
		}
		return result;
	}
	
	public static boolean[] shiftRight(boolean[] register, int n){
		boolean[] result = new boolean[register.length];
		System.arraycopy(register, 0, result, n, register.length-n);
		return result;
	}
	
	public static void printBuffer(boolean[] register){
		String temp = "";
		for(int i=0; i<register.length; i++){
			temp= register[i]? "1": "0";
			System.out.print(temp+" ");
		}
		System.out.println();
	}
	
	public static boolean[] o512(boolean[] x){
		boolean result[] = new boolean[64];
		boolean satu[] = rotateRight(x,1);
		boolean lapan[] = rotateRight(x,8);
		boolean tujuh[] = shiftRight(x,7);
		for(int i=0; i<64; i++){
			result[i] = satu[i] ^ lapan[i] ^ tujuh[i]; 
		}
		return result;
	}
	
	public static boolean[] i512(boolean[] x){
		boolean result[] = new boolean[64];
		boolean sembilanBelas[] = rotateRight(x,19);
		boolean enamSatu[] = rotateRight(x,61);
		boolean enam[] = shiftRight(x,6);
		for(int i=0; i<64; i++){
			result[i] = sembilanBelas[i] ^ enamSatu[i] ^ enam[i]; 
		}
		return result;
	}
	
	public static String toString(boolean[] a){
		String b="";
		for(int i=0; i < 4; i++){
			if(a[i]==true)
				b+="1";
			else
				b+="0";
		} return b;
	}
	
	public static String toString2(boolean[] a){
		String b="";
		for(int i=0; i < 8; i++){
			if(a[i]==true)
				b+="1";
			else
				b+="0";
		} return b;
	}
}
