package chloe.HULL;

public class Hull {
	
	private String IDNumber;
	private FwdHullSection SectionFWD;
	private AftHullSection SectionAFT;
	private String StarDestroyerType;
	
	public Hull(String IDNumber, String StarDestroyerType) {
		this.IDNumber=IDNumber;
		this.StarDestroyerType=StarDestroyerType;
		
	}
	
	

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public FwdHullSection getSectionFWD() {
		return SectionFWD;
	}

	public void setSectionFWD(FwdHullSection sectionFWD) {
		SectionFWD = sectionFWD;
	}

	public AftHullSection getSectionAFT() {
		return SectionAFT;
	}

	public void setSectionAFT(AftHullSection sectionAFT) {
		SectionAFT = sectionAFT;
	}
	
	
	public void displayHullSpecs() {
		System.out.println("______Hull SPECIFICATIONS");
		System.out.println("Hull Number: "+this.IDNumber);
		System.out.println("\t\t\t\tLength\tHeight\tWidth\tWeight");
		
		this.setSectionFWD(new FwdHullSection(this.StarDestroyerType));
		this.setSectionAFT(new AftHullSection(this.StarDestroyerType));
		System.out.println("Forward Hull:\t\t\t"+this.getSectionFWD().getLength()+"\t"
				+this.getSectionFWD().getHeight()+"\t"+this.getSectionFWD().getWidth()+"\t"
				+this.getSectionFWD().getWeight());
		
		System.out.println("Aft Hull:\t\t\t"+this.getSectionAFT().getLength()+"\t"
				+this.getSectionAFT().getHeight()+"\t"+this.getSectionAFT().getWidth()+"\t"
				+this.getSectionAFT().getWeight());
	}
	
	
	
	

}
