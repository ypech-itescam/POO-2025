public  class Varita{
	private String material;
	private int mana;

	public Varita(String material, int mana){
		this.material = material.equals("")?"Madera": material;
		this.mana = mana;
	} 

	public void setMaterial(String material){
		this.material = material.equals("")?"Madera": material;
	}

	public void setMana(int mana){
		this.mana = mana;
	}

	public String getMaterial(){
		return material;
	}

	public int getMana(){
		return mana;
	}

	public void absorberMana(int cantidad) {
        mana += cantidad;
    }

    public void liberarMana(int cantidad) {
        if (mana >= cantidad) {
            mana -= cantidad;
        } else {
            System.out.println("No hay suficiente mana para liberar.");
        }
    }

	public String mostrar(){
		return getMaterial() + " " + getMana();
	}
}