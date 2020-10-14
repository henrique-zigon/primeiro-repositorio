import requests
import json

class GeralOpenHardwareMonitor:
    def __init__(self):
        self.url="http://25.7.171.134:8085/data.json"
        self.data=None

    def pegarJason(self):
        resposta = requests.get(self.url)
        data1 = json_data = resposta.json()
        self.data = data1
    
    def filtrarInfo(self):
        self.pegarJason()
        info={
            
        }