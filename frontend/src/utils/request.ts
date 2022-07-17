export const BASE_URL = import.meta.env.VITE_BACKEND_URL ?? "http://localhost:8080";

// const armazena uma variavel chamad a VBURL que costuma ser uma varavel de ambiente 
// que é configurada para o frontend, caso ela não exista é utilizado o local host

// ?? operador de coalescencia nula

// na direita é o valor padrão, mas caso exista o valor da variavel de ambiente, ele será utilizado
