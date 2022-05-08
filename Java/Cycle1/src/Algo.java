import java.util.Scanner;

class ReqMsg{
	int rsite;
	int timeStamp;
	boolean reply=false;
	ReqMsg(int site,int timeStamp,boolean reply){
		this.rsite=site;
		this.timeStamp=timeStamp;
		this.reply=reply;
	}
}
 class site{
	String ssite;
	boolean CSAccess=false;
	boolean Requesting=false;
	ReqMsg[] q=new ReqMsg[10];
	site(String site,boolean CSAccess,boolean Requesting) {
		this.ssite=site;
		this.CSAccess=CSAccess;
		this.Requesting=Requesting;
 	}
}
 class Algo {
	
	public static void main(String [] args) {
		
		//Site 1 created with request queue.
		boolean CSAccess=false;;
		boolean Requesting=false;
		int x=0;
		System.out.println("Enter the number of sites");
		site[] S=new site[10];
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int t=0;
		for (int i=0;i<n;i++) {
			System.out.println("Enter whether the site "+(i+1)+" has Critical section access (0/1)");
			if(sn.nextInt()==1)
				CSAccess=true;
			System.out.println("Enter whether the site "+(i+1)+" is requesting access for critical section (0/1)");
			if(sn.nextInt()==1) {
				Requesting=true;
				System.out.println("Enter the timestamp of site "+(i+1));
				t=sn.nextInt();
				}
			
			S[i]=new site("p",CSAccess,Requesting);
			ReqMsg R = null;
			if(Requesting) {
				for (int j=0;j<n;j++) {
					if(i!=j) {
						R = new ReqMsg(j,t,false);	
						S[i].q[x]= R;
						x++;
					}	
				}
				x=0;	
				}
				
			CSAccess=false;
			Requesting=false;
		}
		System.out.println("Enter site number which require Critical Section access");
		int Snum=sn.nextInt();
		Snum=Snum-1;
		for (int i=0;i<n-1;i++) {
			if(S[Snum].Requesting) {
				if(!(S[(S[Snum].q[i].rsite)-1].CSAccess) )
					if(S[(S[Snum].q[i].rsite)-1].Requesting)
						if(S[Snum].q[0].timeStamp<S[(S[Snum].q[i].rsite)-1].q[0].timeStamp) 
							S[Snum].q[i].reply=true;	
					else
						S[Snum].q[i].reply=true;	
				/*if(!(P3.CSAccess))
					if(P3.Requesting) {
						if(P1.q[2].timeStamp<P3.q[0].timeStamp) 
							P1.q[1].reply=true;}
					else {
					P1.q[1].reply=true;}*/
			}
		}
		
		if(S[Snum].q[0].reply && S[Snum].q[1].reply)
			System.out.println("Site P1 has access to the CS");
		
	}	
}
