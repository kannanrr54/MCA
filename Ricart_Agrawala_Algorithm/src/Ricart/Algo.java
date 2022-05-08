package Ricart;
class ReqMsg{
	String rsite;
	int timeStamp;
	boolean reply=false;
	ReqMsg(String site,int timeStamp,boolean reply){
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
		site P1=new site("p1",false,true);
		ReqMsg P1_R1 = new ReqMsg("p2",10,false);
		ReqMsg P1_R2 = new ReqMsg("p3",10,false);
		P1.q[0]= P1_R1;
		P1.q[1]= P1_R2;
		//Site 2 created with request queue.
		site P2=new site("p2",false,true);
		ReqMsg P2_R1 = new ReqMsg("p1",20,false);
		ReqMsg P2_R2 = new ReqMsg("p3",20,false);
		P2.q[0]= P2_R1;
		P2.q[1]= P2_R2;
		//Site 2 created.
		//String AccessSite;
		site P3=new site("p3",false,false);
		if(P1.Requesting) {
			if(!(P2.CSAccess) )
				if(P2.Requesting)
					if(P1.q[0].timeStamp<P2.q[0].timeStamp) 
						P1.q[0].reply=true;	
				else
					P1.q[0].reply=true;	
			if(!(P3.CSAccess))
				if(P3.Requesting)
					if(P1.q[2].timeStamp<P3.q[0].timeStamp) 
						P1.q[2].reply=true;
				else
					P1.q[2].reply=true;
		}
		if(P1.q[0].reply && P1.q[1].reply)
			System.out.println("Site P1 has access to the CS");
		
	}	
}
