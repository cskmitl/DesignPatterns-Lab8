public class ImageManager {
	private Renderer renderer;

	public void setRendererType(String type) {
		if (type.equalsIgnoreCase("TV")) {
			this.renderer = new TVRenderer();
		} else if (type.equalsIgnoreCase("Laptop")) {
			this.renderer = new LaptopRenderer();
		} else if (type.equalsIgnoreCase("Smartphone")) {
			this.renderer = new SmartphoneRenderer();
		} else {
			throw new IllegalArgumentException("Invalid renderer type");
		}
	}

	public void show() {
		if (renderer != null) {
			renderer.showImage();
		} else {
			throw new IllegalStateException("Renderer has not been set");
		}
	}
}