# HibernateProject
![Главная картинка](readme_assets/title.png)<hr>

## Описание

Приложение демонстрирует работу библиотеки **Hibernate** при помощи **SessionFactory**
В данном приложении продемонстрированы отношения *OneToOne*, *OneToMany (Uni-directional)* и *ManyToMany*
1. В примере **OneToOne** показано отношение между директором и школой
2. В примере **OneToMany** показано отношение между классом и студентами
3. В примере **ManyToMany** показано отношение между детьми и секциями
<hr>

### Требования
Для запуска проекта необходим [MySQL](https://dev.mysql.com/downloads/installer "Вы можете скачать, перейдя по ссылке")
и [Maven](https://dev.mysql.com/downloads/installer)

### Начало работы
В файле ``hibernate.cfg.xml`` необходимо установить логин и пароль от БД, а также её название
1. В строке ``<property name="connection.username">root</property>`` устанавливаем имя пользователя
2. В строке ``<property name="connection.password">admin</property>`` устанавливаем пароль
3. В строке ``<property name="connection.url">jdbc:mysql://localhost:3306/hibernate?useSSL=false&amp;serverTimezone=UTC</property>`` вместо **hibernate** указываем название БД
