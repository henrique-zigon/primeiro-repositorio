set.seed(999)
n<-6048

#-----------------IDADE--------------------------------
faixaIdade<-abs(round(rnorm(n,23,5),0))

data.default<-data.frame(table(faixaIdade))
data.default<-data.frame(id=(1:length(data.default$Freq)),data.default)

freq_relativa<-round((data.default$Freq/sum(data.default$Freq)*100),2)

data.freq<-data.frame(freq_relativa)
data.freq<-data.frame(id=(1:length(data.freq$freq_relativa)),freq_relativa)

tabelaFinal<-data.frame(merge(data.default,data.freq))

barplot(tabelaFinal$freq_relativa,xlab= "idade",ylab="Frequência_Relativa")
barplot(prop.table(tabelaFinal$freq_relativa),xlab="idade",ylab="Frequência
+ Relativa",col=c("red","blue"))

#-----------------RENDA MENSAL----------------------
hist(prop.table(tabelaFinal$faixaIdade),xlab="idade",ylab="Frequência
+ Relativa",col=c("red","blue"))
