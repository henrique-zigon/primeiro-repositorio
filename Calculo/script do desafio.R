meses<-c(1:10)
pre�os<-c(60,65,85,50,56,90,58,88,55,70)
tabela<-data.frame(meses,pre�os)
#criando tabela



tabela
#plota tabela
plot(tabela$meses,tabela$pre�os)
x<-(lm(tabela$pre�os~tabela$meses))
summary(x)#Achar equa��o=0.5636*x+64.6000(coefficients)
equacao<-0.5636*11+64.6

#coloca uma reta de previs�o em cima do grafico anterior
abline(lm(tabela$pre�os~tabela$meses))

#mostra gr�fico de residuos
plot(lm(tabela$meses~tabela$pre�os))
#------------------------------------------------

#criando tabela com previs�o
meses1<-c(1:11)
pre�os1<-c(60,65,85,50,56,90,58,88,55,70,equacao)
tabela1<-data.frame(meses1,pre�os1)

#plota tabela1
plot(tabela1$meses1,tabela1$pre�os1)

#coloca reta
abline(lm(tabela1$pre�os1~tabela1$meses1))

#-------------------------------------------------

#criando tabela para previs�o
pre�os2<-c(70,70.79,75.86)    #dados calculados no excel(ultimo � erro padr�o)
meses2<-c("Oct","Nov-Atual","Nov-forecast")          
tabela2<-data.frame(meses2,pre�os2)

#plotar gr�fico de barra da previs�o
barplot(tabela2$pre�os2,names.arg= tabela2$meses2,ylab="$")

#--------------------------------------------------

#criando variaveis
ec2<-44.5356
EBS<-14.9031
s3<-11.3512
pre�osSeparados<-c(ec2,EBS,s3)
pie(pre�osSeparados)

#----------------------------------------------------

#Juros Compostos do billing(10%) de Janeiro at� o mes previsto
tabelaJuros<-data.frame("mes","pre�o sem Juros","JurosCompostos")
dividaJaneiro<-0
montante<-0
for (i in tabela1$meses1) {
  montante=tabela1$pre�os1[i]*(1+0.1)**i
  tabelaJuros[i,]<-data.frame(mes=i,pre�osSemJuros=tabela1$pre�os1[i],pre�osJC=round(montante,2),stringsAsFactors = FALSE)
}
tabelaJuros
#Estimativa de pre�o sem juros p/ compara��o
sum(tabela1$pre�os1)
#Soma dos meses com juros compostos se pagar em novembro
sum(as.double(tabelaJuros$X.JurosCompostos.[1:10]))+as.double(tabelaJuros$X.pre�o.sem.Juros.[11]) 
