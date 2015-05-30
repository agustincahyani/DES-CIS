
public class Solution {

	public static void main(String[] args) {
		boolean[] cobaRotate = {
				true, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true,
				true, false, false, true, false, true, false, true,
				false, false, false, true, false, true, false, true,
		};
		
		boolean[] hasil = rotateRight(cobaRotate, 8);
		printBuffer(cobaRotate);
		printBuffer(hasil);

	}
	
	public static boolean[] addBinary(boolean[] a, boolean[] b) {
		boolean[] hasil = new boolean[a.length];
        int carry = 0;
        for(int i = 0; i < a.length; i++){
            int m = (a[a.length - i - 1])==false? 0: 1;
            int n = (b[b.length - i - 1])==false? 0: 1;
            int add = m + n + carry;
            
            hasil[a.length - i - 1]= (add % 2)==0? false: true;
            carry = add / 2;
        }return hasil;
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
		System.arraycopy(register, 0, register, n, register.length-n);
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
	
	public static void printBuffer(boolean[] register){
		String temp = "";
		for(int i=0; i<register.length; i++){
			temp= register[i]? "1": "0";
			System.out.print(temp+" ");
		}
		System.out.println();
	}
}
