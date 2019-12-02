[ -d build ] && rm -rf build
find . -name *.java > result.txt
sort result.txt > sources.txt
mkdir build
javac src/com/computor/Computor.java -sourcepath @sources.txt -d build
rm -rf result.txt
rm -rf sources.txt

