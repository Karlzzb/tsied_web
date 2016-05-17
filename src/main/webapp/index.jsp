<html>
  <head>
    <meta charset="UTF-8" />
    <title>Hello React!</title>
    <script src="<%=request.getContextPath() %>/views/js/react.min.js"></script>
    <script src="<%=request.getContextPath() %>/views/js/react-dom.min.js"></script>
  </head>
  <body>
    <div id="container">
      <p>
        To install React, follow the instructions on
        <a href="https://github.com/facebook/react/">GitHub</a>.
      </p>
      <p>
        If you can see this, React is <strong>not</strong> working right.
        If you checked out the source from GitHub make sure to run <code>grunt</code>.
      </p>
    </div>
    <script>
      var ExampleApplication = React.createClass({
        render: function() {
          var elapsed = Math.round(this.props.elapsed  / 100);
          var seconds = elapsed / 10 + (elapsed % 10 ? '' : '.0' );
          var message =
            'React has been successfully running for ' + seconds + ' seconds.';

          return React.DOM.p(null, message);
        }
      });

      // Call React.createFactory instead of directly call ExampleApplication({...}) in React.render
      var ExampleApplicationFactory = React.createFactory(ExampleApplication);

      var start = new Date().getTime();
      setInterval(function() {
        ReactDOM.render(
          ExampleApplicationFactory({elapsed: new Date().getTime() - start}),
          document.getElementById('container')
        );
      }, 50);
    </script>
  </body>
</html>