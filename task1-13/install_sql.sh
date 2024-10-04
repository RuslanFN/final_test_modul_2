vboxuser@ubuntu:~$ cat > 'Домашние животные'
Собаки
Хомяки
Кошки
^C
vboxuser@ubuntu:~$ cat > 'Вьючные животные'
Лошадь
Верблюд
Осёл

vboxuser@ubuntu:~$ cat 'Вьючные животные' 'Домашние животные' > 'Друзья человека'
vboxuser@ubuntu:~$ mkdir hw

vboxuser@ubuntu:~$ mv 'Друзья человека' hw
vboxuser@ubuntu:~$ ls hw
'Друзья человека'

# Установка mysql

wget https://dev.mysql.com/get/mysql-apt-config_0.8.32-1_all.deb
dpkg -i mysql-apt-config_0.8.32-1_all.deb
apt install mysql-server

# Установка и удаление deb
wget https://go.microsoft.com/fwlink/?LinkID=760868
mv index.html\?LinkID=760868 vscode
sudo dpkg -i vscode
sudo dpkg -r code


