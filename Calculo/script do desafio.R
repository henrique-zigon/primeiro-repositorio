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

#Juros do billing(10%) de Janeiro até o mes previsto
capi<-0
for (i in meses1) {
  capi<-preços1[i]+capi
  montante=capi*(1+0.1)**i
}
montante
#Estimativa de preço sem juros p/ comparação
sum(preços1)
