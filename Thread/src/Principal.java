
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new Thread(thread1).start();
		new Thread(thread2).start();
		new Thread(thread3).start();

	}
	
	private static void imprimir(String t) {
		System.out.println(t);
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for(int cont=0;cont<100;cont++) {
				imprimir("Thread1 = "+cont);
			}
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for(int cont=0;cont<100;cont++) {
				imprimir("Thread2 = "+cont);
			}
			
		}
	};

	private static Runnable thread3 = new Runnable() {
		
		@Override
		public void run() {
			for(int cont=0;cont<100;cont++) {
				imprimir("Thread3 = "+cont);
			}
			
		}
	};
}
