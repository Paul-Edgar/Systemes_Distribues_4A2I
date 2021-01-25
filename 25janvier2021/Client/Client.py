from zeep import Client
client = Client("http://localhost:8989/?wsdl")
result = client.service.methode(10)
print("Le résultat renvoyé par le service est", result)