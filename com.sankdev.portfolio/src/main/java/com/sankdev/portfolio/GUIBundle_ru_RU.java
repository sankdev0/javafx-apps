package com.sankdev.portfolio;

// Russian language
public class GUIBundle_ru_RU extends GUIBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
				// LOCALIZE THIS
				{ "appTitle", "Портфолио студенческих работ" },
				{ "editWindowTitle", "Редактирование информации о работе" }, { "okKey", "Принять" },
				{ "cancelKey", "Отмена" }, {"editButton","Редактировать"}, { "deleteButton", "Удалить" },
				{"addButton", "Создать"}, {"saveButton", "Сохранить"}, {"loadButton","Загрузить"}
				// END OF MATERIAL TO LOCALIZE
		};
	}
}
