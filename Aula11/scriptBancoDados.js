const sqlite3 = require('sqlite3').verbose();

// Abre (ou cria) um banco de dados SQLite
const db = new sqlite3.Database('meuBancoDeDados.db', (err) => {
    if (err) {
        return console.error(err.message);
    }
    console.log('Conectado ao banco de dados SQLite.');
});

// Cria a tabela 'contatos' se ela não existir
const criarTabela = `
    CREATE TABLE IF NOT EXISTS contatos (
        codigo INTEGER PRIMARY KEY AUTOINCREMENT,
        nome TEXT NOT NULL,
        email TEXT NOT NULL,
        celular TEXT NOT NULL
    );
`;

db.run(criarTabela, (err) => {
    if (err) {
        return console.error('Erro ao criar a tabela:', err.message);
    }
    console.log('Tabela "contatos" criada ou já existe.');
});

// Fecha o banco de dados após a operação
db.close((err) => {
    if (err) {
        return console.error(err.message);
    }
    console.log('Conexão com o banco de dados fechada.');
});
