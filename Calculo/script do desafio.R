meses<-c(1:10)
preços<-c(60,65,85,50,56,90,58,88,55,70)
tabela<-data.frame(meses,preços)
#criando tabela



tabela
#plota tabela
plot(tabela$meses,tabela$preços)
x<-(lm(tabela$preços~tabela$meses))
summary(x)#Achar equação=0.5636*x+64.6000(coefficients)
equacao<-0.5636*11+64.6

#coloca uma reta de previsão em cima do grafico anterior
abline(lm(tabela$preços~tabela$meses))

#mostra gráfico de residuos
plot(lm(tabela$meses~tabela$preços))
#------------------------------------------------

#criando tabela com previsão
meses1<-c(1:11)
preços1<-c(60,65,85,50,56,90,58,88,55,70,equacao)
tabela1<-data.frame(meses1,preços1)

#plota tabela1
plot(tabela1$meses1,tabela1$preços1)

#coloca reta
abline(lm(tabela1$preços1~tabela1$meses1))

#-------------------------------------------------

#criando tabela para previsão
preços2<-c(70,70.79,75.86)    #dados calculados no excel(ultimo é erro padrão)
meses2<-c("Oct","Nov-Atual","Nov-forecast")          
tabela2<-data.frame(meses2,preços2)

#plotar gráfico de barra da previsão
barplot(tabela2$preços2,names.arg= tabela2$meses2,ylab="$")

#--------------------------------------------------

#criando variaveis
ec2<-44.5356
EBS<-14.9031
s3<-11.3512
preçosSeparados<-c(ec2,EBS,s3)
pie(preçosSeparados)

#----------------------------------------------------

#Juros Compostos do billing(10%) de Janeiro até o mes previsto
tabelaJuros<-data.frame("mes","preço sem Juros","JurosCompostos")
dividaJaneiro<-0
montante<-0
for (i in tabela1$meses1) {
  montante=tabela1$preços1[i]*(1+0.1)**i
  tabelaJuros[i,]<-data.frame(mes=i,preçosSemJuros=tabela1$preços1[i],preçosJC=round(montante,2),stringsAsFactors = FALSE)
}
tabelaJuros
#Estimativa de preço sem juros p/ comparação
sum(tabela1$preços1)
#Soma dos meses com juros compostos se pagar em novembro
sum(as.double(tabelaJuros$X.JurosCompostos.[1:10]))+as.double(tabelaJuros$X.preço.sem.Juros.[11]) 
