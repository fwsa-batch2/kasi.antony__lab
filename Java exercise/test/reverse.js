let num1=parseInt(prompt("ENTER A NUMBER"));
let num=0;
while (num1 !=0 ) {
    num = (num*10)+(num%10);
    num1 = num/10;
}
document.write(num);