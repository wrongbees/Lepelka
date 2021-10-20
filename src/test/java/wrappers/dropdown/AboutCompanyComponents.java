package wrappers.dropdown;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum AboutCompanyComponents {

    THE_HISTORY_OF_DEVELOPMENT("История развития"),
    GALLERY("Галерея"),
    BRANDED_TRADE("Фирменная торговля"),
    CERTIFICATES("Сертификаты"),
    AWARDS_AND_DIPLOMAS("Награды и дипломы"),
    SURVEY("Опрос"),
    IDEOLOG_WORK("Идеологическая работа");

    @Getter
    private String component;


}
