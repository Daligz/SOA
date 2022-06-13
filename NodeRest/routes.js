const express = require('express')
const routes = express.Router()

routes.get('/', (req, res) => {
    req.getConnection((err, conn) => {
        if (err) return res.send(err)

        conn.query('SELECT * FROM tbusuarios', (err, rows) => {
            if (err) return res.send(err)

            res.json(rows)
        })
    })
})

routes.post('/', (req, res) => {
    req.getConnection((err, conn) => {
        if (err) return res.send(err)
        conn.query('INSERT INTO tbusuarios set ?', [req.body], (err, rows) => {
            if (err) return res.send(err)

            res.send('Usuario added!')
        })
    })
})

routes.delete('/:id', (req, res) => {
    req.getConnection((err, conn) => {
        if (err) return res.send(err)
        conn.query('DELETE FROM tbusuarios WHERE id = ?', [req.params.id], (err, rows) => {
            if (err) return res.send(err)

            res.send('Usuario excluded!')
        })
    })
})

routes.put('/:id', (req, res) => {
    req.getConnection((err, conn) => {
        if (err) return res.send(err)
        conn.query('UPDATE tbusuarios set ? WHERE id = ?',
            [req.body, req.params.id], (err, rows) => {
                if (err) return res.send(err)

                res.send('Usuario updated!')
            })
    })
})

module.exports = routes