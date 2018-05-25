var http = require('http');
var formidable = require('formidable');
var fs = require('fs');

http.createServer(function (req, res) {
  if (req.url == '/uploadfile') {
    var form = new formidable.IncomingForm();
    form.parse(req, function (err, fields, files) {
      var oldpath = files.filetoupload.path;
        fs.readFile(oldpath, 'utf8', function (err,data) {
            if (err) {
              return console.log(err);
            } else {
              res.writeHead(200, { 'Content-Type': 'text/html' });
              res.write(data);
            }
            console.log(data);
        });
    });
  } else {
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write('<form action="uploadfile" method="post" enctype="multipart/form-data">');
    res.write('<input type="file" name="filetoupload"><br>');
    res.write('<input type="submit">');
    res.write('</form>');
    return res.end();
  }
}).listen(8080);  
