package homeworkDay2;

public class CategoryManager {
	public void Add(Category category) {
		System.out.println(category.categoryName + " " + "Eklendi");
	}
	
	public void Select(Category category) {
		System.out.println(category.categoryName + " " + "Se�ildi");
	}
	
	public void Delete(Category category) {
		System.out.println(category.categoryName + " " + "Silindi");
	}
	
	public void Update(Category category) {
		System.out.println(category.categoryName + " " + "G�ncellendi");
	}
}
