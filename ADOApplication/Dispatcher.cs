using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ADOApplication
{
    class Dispatcher
    {
        private int dispatcherId;
        private String dispatcherName;
        private String dispatcherEmail;
        private String dispatcherPhone;

        public int DispatcherId { get => dispatcherId; set => dispatcherId = value; }
        public string DispatcherName { get => dispatcherName; set => dispatcherName = value; }
        public string DispatcherEmail { get => dispatcherEmail; set => dispatcherEmail = value; }
        public string DispatcherPhone { get => dispatcherPhone; set => dispatcherPhone = value; }
    }
}
